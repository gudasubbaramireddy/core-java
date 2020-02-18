package designpatterns.factorymethodpattran;
/*if you use interface you should use calculateBill as default.but rate could be final.you should declare.you can't change in sub classes.
* if you want to use interface the requirement could have methods ,default methods only.*/
abstract class Plan {
    double rate;

    abstract void getRate();

    void calculateBill(int units) {
        System.out.println(units*rate);
    }
}
