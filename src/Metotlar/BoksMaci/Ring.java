package Metotlar.BoksMaci;

public class Ring {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run(){
        if (checkWeight()) {
            while (this.f1.health > 0 && this.f2.health > 0) {
                System.out.println("===== NEW ROUND =====");
                double randomNumber = Math.random() *100;
                if (randomNumber > 50){
                    this.f2.health = this.f1.hit(f2);
                    if (isWin()) {
                        break;
                    }
                    printScore();
                }
                else if (randomNumber <= 50){
                    this.f1.health = this.f2.hit(f1);
                    if (isWin()) {
                        break;
                    }
                    printScore();
                }
            }
        }
        else {
            System.out.println("Sporcuların ağırlıkları uyuşmuyor.");
        }

    }
    public boolean checkWeight() {
        return (f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight);

    }

    public boolean isWin(){
        if (f1.health == 0){
            System.out.println("Maçı kazanan: "+ f2.name);
            return true;
        }
        else if ( f2.health == 0){
            System.out.println("Maçı kazanan: "+ f1.name);
            return true;
        }
        return false;
    }
    public void printScore(){
        //System.out.println("----------");
        System.out.println(f1.name + " kalan can: "+ f1.health);
        System.out.println(f2.name + " kalan can: "+ f2.health);
    }
}
