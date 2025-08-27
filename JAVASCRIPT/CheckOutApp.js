const prompt = require("prompt-sync")(); 

function productDetails(){

console.log("SEMICOLON STORES");
console.log("  ");
console.log("PRODUCTS AND PRICES");
console.log("  ");



console.log("CASHIER APP");


let customersName = prompt("WHAT IS THE CUSTOMER'S NAME: ");
console.log("  ");

let customerspurchase = prompt("WHAT DID THE USER BUY? ");
console.log("  ");

let quantity = prompt("HOW MANY PIECES?: ");
console.log("  ");


let unitPrice = prompt("HOW MUCH PER UNIT ₦: ");
console.log("  ");
let CashierName = prompt("WHAT IS YOURNAME?: ");
console.log("  ");

const discount = prompt("HOW MUCH DISCOUNT PERCENTAGE WILL HE GET?: ");

console.log("  ");


let items = prompt("ADD MORE ITEMS?: ").toUpperCase(); 




console.log("  ")


let customerSecondpurchase = prompt("WHAT DID THE USER BUY? ");
console.log("  ");

let secondQuantity = prompt("HOW MANY PIECES?: ");
console.log("  ");
let SecondUnitPrice = prompt("HOW MUCH PER UNIT ₦: ");
console.log("  ");

let secondDiscount = prompt("HOW MUCH DISCOUNT WILL HE GET?: ");




let firstUntiTotal = unitPrice * quantity;

let secondUnitTotal = SecondUnitPrice * secondQuantity;

let subtotal = firstUntiTotal + secondUnitTotal

let discountPercentage = (discount + secondDiscount)/ 100
let discountAmount = subtotal * discountPercentage
let totalDiscount = discountAmount - subtotal

let vat = (subtotal * 7.5) / 100

let billTotal = (subtotal + totalDiscount) - vat;

console.log("  ");


while(true){
console.log("SEMICOLON STORES RECIEPT \n  ")

console.log("MAIN BRANCH\n")
console.log("LOCATION:  312, HERBERT MACUAULAY WAY, SABO YABA, LAGOS.\n")
console.log("TEL: 8158869243\n")
console.log("Date:")
console.log(Date())

console.log("Cashier: " + CashierName)
console.log("customer Name: " + customersName)
console.log("=========================================================")

console.log("ITEM  QTY PRICE  TOTAL(NGN)")
console.log("---------------------------------------------------------")
console.log(`${customerspurchase}   ${quantity}   ₦${unitPrice}    ₦${firstUntiTotal}`)
console.log(" ");
console.log(`${customerSecondpurchase}   ${secondQuantity}    ₦${SecondUnitPrice}    ₦${secondUnitTotal}`);
console.log("  ");

console.log("---------------------------------------------------------")
console.log(`sub Total: ${subtotal}`)
console.log(`Discount: ${totalDiscount}`)
console.log(`VAT @ 17.50%: ${totalDiscount}`)
console.log("=========================================================")

console.log(`Bill Total: ${billTotal}`)
console.log("=========================================================")
console.log("THIS IS NOT AN RECEIPT KINDLY PAY: " + billTotal)
console.log("      ");


let amountPaid = prompt("HOW MUCH DID THE CUSTOMER GIVE YOU: ")

console.log(`Bill Total: ${billTotal}`)
console.log(`Amount Paid: ${amountPaid}`)
console.log(`Balance: ${amountPaid-billTotal}`)
console.log("=========================================================")
console.log("THANKS YOU FOR YOUR PATRONAGE")
console.log("=========================================================")

break;
}


}

productDetails()






