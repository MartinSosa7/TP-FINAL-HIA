import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ApiService {

  private baseUrl = "http://localhost:8080/products";

  constructor(private http: HttpClient){ }

  // GET: Obtener todos los productos
  public getProducts(): Observable<any> {
    return this.http.get<any>(`${this.baseUrl}/getProducts`);
  }

  // POST: Agregar un producto
  public addProduct(name: string, price: number): Observable<any> {
    const product = { name, price }; // Crea el objeto que será enviado al backend
    return this.http.post<any>(`${this.baseUrl}/add`, product);
  }

  // DELETE: Eliminar un producto por su ID
  public deleteProduct(productId: number): Observable<any> {
    return this.http.delete<any>(`${this.baseUrl}/delete/${productId}`);
  }

  updateProduct(product: any): Observable<any> {
    return this.http.put<any>(`${this.baseUrl}/update`, product);
  }
  
}
