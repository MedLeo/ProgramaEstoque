package entities;

public class Product {

    public String name;
    public double price;
    public int quantity; //atributo da classe

    //método para valor total em estoque
    public double totalValueInStock() {
        return price * quantity;
    }

    //método para adicionar quantidade de produto
    public void addProducts(int quantity) { //quantity aqui é parametro do método
        this.quantity += quantity;
        //this faz referência ao atributo da classe
    }

    //método para remover quantidade de produto
    public void removeProduct(int quantity) {
        this.quantity -= quantity;
    }

    public String toString(){
        return name
             + ", $ "
             + String.format("%.2f", price)
             + " , "
             + quantity
             + " units, Total: $ "
             + String.format("%.2f", totalValueInStock());
    }

}
