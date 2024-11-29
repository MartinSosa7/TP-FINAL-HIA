import { Component, OnInit } from '@angular/core';
import { ApiService } from '../service/api.service';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-product-form',
  templateUrl: './product-form.component.html',
  styleUrls: ['./product-form.component.css']
})
export class ProductFormComponent implements OnInit {
  name: string = '';
  price: number | null = null;
  isEditMode: boolean = false;
  productId: number | null = null;

  constructor(private service: ApiService, private router: Router, private route: ActivatedRoute) {}

  ngOnInit(): void {
    // Verificar que estamos en un entorno de navegador antes de acceder a history
    if (typeof window !== 'undefined' && window.history) {
      const state = window.history.state as { product: any };
      
      if (state?.product) {
        this.isEditMode = true;
        this.productId = state.product.id;
        this.name = state.product.name;
        this.price = state.product.price;
        console.log('State passed to ProductFormComponent:', state);
      }
    } else {
      // Alternativa: Usa ActivatedRoute si history no está disponible
      this.route.params.subscribe(params => {
        const state = params['product'] as { product: any };
        if (state?.product) {
          this.isEditMode = true;
          this.productId = state.product.id;
          this.name = state.product.name;
          this.price = state.product.price;
          console.log('State passed from route params:', state);
        }
      });
    }
  }

  saveProduct(): void {
    if (this.name && this.price !== null) {
      if (this.isEditMode && this.productId !== null) {
        // Update product
        this.service.updateProduct({ id: this.productId, name: this.name, price: this.price })
          .subscribe(() => this.router.navigate(['/']));
      } else {
        // Add product
        this.service.addProduct(this.name, this.price)
          .subscribe(() => this.router.navigate(['/']));
      }
    }
  }
}
