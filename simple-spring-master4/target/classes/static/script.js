function mul(a, b){
    return a * b;
}

function div(a, b){
    return a / b;
}

function mod(a, b){
    return a % b;
}

class Car{
    //this to wskaźnik na bieżący obiekt
    constructor(color, power, model) {
        this.color = color; //deklaracja pola z przypisaniem
        this.model = model;
        this.power = power;
    }

    getColor(){
        return this.color;
    }

    getPower(){
        return this.power;
    }
}

function demoCar() {
    let fiat = new Car("red", 140, "500");
    console.log(fiat);
}

let bonus1 = function (amount){
    return amount * 0.95;
}

let bonus2 = function (amount, period){
    return period > 2 ? amount*0.9 : amount * 0.95;
}

let calcPrice = function(price, bonus){
    return bonus(price);
}

calcPrice(100, bonus1);
calcPrice(100, bonus2);



