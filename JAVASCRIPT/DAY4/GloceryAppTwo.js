
const prompt = require('prompt-sync')();




function printList(list) {
let output = "\n=== Grocery List ===\n";
if (list.length === 0) {
output += "No items in the list.";
} else {
list.forEach((item, index) => {
output += `${index + 1}. ${item}\n`;
});
}
console.log(output);
}

function groceryApp() {
const store = [];
let choice;

do {
choice = prompt(

"=== Select Menu ===\n" +
"1. Add item\n" +
"2. Remove item\n" +
"3. Show available items\n" +
"0. Exit\n\n" +
"Select a function from (1-3) or 0 to exit:"
);

switch (choice) {
case "1":
const item = prompt("Enter item to add:");
if (item) {
store.push(item);
console.log(`${item} added to the list.`);
}
break;

      
case "2":
if (store.length === 0) {
console.log("No items to remove.");
break;
}
        
printList(store);
const index = parseInt(prompt("Enter item number to remove:"), 10);
if (index > 0 && index <= store.length) {
const removedItem = store.splice(index - 1, 1);
console.log(`${removedItem} removed from the list.`);
} else {
console.log("Invalid item number.");
}
        
break;

case "3":
printList(store);
break;

     
case "0":
console.log("Exiting the app. Goodbye!");
break;

default:
console.log("Invalid choice. Please select between 0 and 3.");
}
} while (choice !== "0");
}

groceryApp();