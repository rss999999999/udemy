/*

ENCAPSULAMENTO (AULA 78)
Um objeto NAO deve expor nenhum atributo (modificador de acesso private)
Os atributos devem ser privador e devem somente ser acessados pelos métodos get e set

posso criar os construtores, get e set com_ 
Shift + Alt + S

Aqui estamos na classe entities

private: o membro só pode ser acessado na própria classe
(nada): o membro só pode ser acessado nas classes do mesmo pacote (mesma pasta)
protected: o membro só pode ser acessado no mesmo pacote (mesma pasta), bem como em subclasses de pacotes diferentes
public: o membro é acessado por todas classes (ao menos que ele resida em um módulo diferente que não exporte o pacote onde ele está)

*/

package entities;

public class Product1 {
    private String name;
    private double price;
    private int quantity; //para o quantidade só pode ser alterada qndo tiver entrada e saída no estoque, assim o ideal é criar somente o GET! Não devo criar o SET, q altera o valor da qntidade!!!!!

    //CONSTRUTORES COM SOBRECARGA (COM TRÊS E DOIS), E PADRÃO (SEM PARÂMETROS)

    public Product1() { //construtor padrão
    }
    
    public Product1(String name, double price, int quantity){  //construtor 3 parâmetros
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    
    public Product1(String name, double price){ //construtor 2 parâmetros
        this.name = name;
        this.price = price;
    }

    //GETTERS  (pega o valor do atributo)
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    //SETTERS (altera o valor do atributo); sempre tem o VOID, pois n tem return!!!!
    
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //MÉTODOS

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
