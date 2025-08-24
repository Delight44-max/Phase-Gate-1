const prompt = require("prompt-sync")(); 

let cardNumber = prompt("Enter your credit card number: ");

if (cardNumber.length < 13 || cardNumber.length > 16) {
    console.log("Invalid credit card number!");
    process.exit();
}

let cardDigits = [];
for (let i = 0; i < cardNumber.length; i++) {
    cardDigits.push(parseInt(cardNumber.charAt(i)));
}

if (cardDigits[0] === 4) {
    console.log("\n<<<< credit card type: VISA CARD");
} else if (cardDigits[0] === 5) {
    console.log("\n<<<< credit card type: MASTERCARD");
} else if (cardDigits[0] === 3 && cardDigits[1] === 7) {
    console.log("\n<<<< credit card type: AMERICAN EXPRESS CARD");
} else if (cardDigits[0] === 6) {
    console.log("\n<<<< credit card type: DISCOVER CARD");
} else {
    console.log("CARD NOT RECOGNIZED!");
}

console.log("<<<< credit card Number: " + cardNumber);
console.log("<<<< credit card Digit: " + cardNumber.length);