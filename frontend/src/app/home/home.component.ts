import { Component, OnInit } from '@angular/core';
import { ApiService } from '../service/api.service';
import { Router, NavigationEnd } from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  products: any[] = [];

  constructor(private service: ApiService, private router: Router) {
    // Reload products when returning to home
    this.router.events.subscribe(event => {
      if (event instanceof NavigationEnd && event.url === '/') {
        this.getProducts();
      }
    });
  }

  ngOnInit(): void {
    this.getProducts();
  }

  getProducts() {
    this.service.getProducts().subscribe(products => {
      this.products = products;
    });
  }

  deleteProduct(productId: number): void {
    this.service.deleteProduct(productId).subscribe(() => {
      this.getProducts(); // Refresh the list after deletion
    });
  }

  editProduct(product: any): void {
    this.router.navigate(['/add-product'], { state: { product } });
  }
  
}
