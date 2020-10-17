let store = [
    {name:"żytnia", alcohol: 40, capacity: 500, quantity: 12, id: 0},
    {name:"ksiażece", alcohol: 6, capacity: 500, quantity: 2, id: 1},
    {name:"wiśniówka", alcohol: 20, capacity: 250, quantity: 11, id: 2},
];
let wz = [];
let counter = 3; //tymczasowe rozwiązanie nadawania id
class Alcohol{
    constructor(name, alcohol,capacity) {
        this.name = name
        this.alcohol = alcohol
        this.capacity = capacity
        this.quantity = 0;
        this.id = counter++;
    }
}

function addNewAlcohol(){
    let name = document.getElementById("alco-name");
    let alcohol = document.getElementById("alcohol");
    let capacity = document.getElementById("capacity");
    let newItem = new Alcohol(name.value, alcohol.value, capacity.value);
    store.push(newItem);
    fillTable(store);
}

function fillTable(storeTable){
    let target = document.getElementById("alco-rows");
    target.innerHTML = '';
    for(item of storeTable){
        let row = `<tr> 
                <td>${item.name}</td>
                <td>${item.alcohol} %</td>
                <td>${item.capacity} ml</td>
                <td>${item.quantity}</td>
                <td><button type="button" onclick="addToForm(${item.id})">Wybierz</td>
                </tr>`;
        target.innerHTML += row;
    }
}

function addToForm(id){
    document.getElementById("taken-alco-id").value = id;
    //rozwiązanie tymczasowe
    document.getElementById("taken-alco-name").value = store[id].name;
}

function registerTake(){
    let id = document.getElementById("taken-alco-id");
    let takenQuantity = document.getElementById("taken-alco-quantity")
    let user = document.getElementById("taken-alco-user")
    selectedAlco = store[id.value];
    if (selectedAlco.quantity-takenQuantity.value > 0) {
        selectedAlco.quantity -= takenQuantity.value;
        wz.push({id: id.value, user: user.value, quantity: takenQuantity.value});
        fillTable(store);
    }

}
