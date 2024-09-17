public class TicketMachine {
    private int price;
    private int balance;
    private int stock;
    
    public TicketMachine(int harga, int jml) {
    this.balance = 0;
    this.price = harga;
    this.stock = jml;
    }

    public int getBalance() {
        return this.balance;
    }

    public int getPrice() {
        return this.price;
    }

    public void insertMoney(int uang) {
        this.balance += uang;
    }

    public void buyTicket(int jumlah) {
        if (this.balance < jumlah * this.price) {
            System.out.println("Uangmu kurang!");
        } else if (this.stock < jumlah) {
            System.out.println("Maaf, stok tiket tidak mencukupi!");
        } else {
            this.stock -= jumlah;
            this.balance -= jumlah * this.price;
            System.out.println("Berhasil membeli " + jumlah + " tiket!");
        }
    }

    public void printTicket() {
        System.out.println("=====================");
        System.out.println("Tiket Konser DC/AC");
        System.out.println("Harga: " + getPrice());
        System.out.println("Stok tiket: " + getStock());
        System.out.println("=====================");
    }

    public int getStock() {
        return this.stock;
    }

    public static void main(String[] args) {
        TicketMachine ticket = new TicketMachine(50, 20);
        ticket.printTicket();
        ticket.buyTicket(3);
        ticket.insertMoney(400);
        ticket.buyTicket(4);
        ticket.printTicket();
    }
}
