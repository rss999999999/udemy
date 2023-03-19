/*

o construtor eh iniciado qndo eu uso o comando new
Product p = new Product();
Sobrecarga: é possível especificar mais de um construtor na mesma classe;

*/

package entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public Product() { //construtor padrão

    }

    public Product(String name, double price, int quantity){ //Construtor 3 variáveis (sobrecarga)
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    
    public Product(String name, double price){ //Construtor com sobrecarga
        this.name = name;
        this.price = price;
    }

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}
