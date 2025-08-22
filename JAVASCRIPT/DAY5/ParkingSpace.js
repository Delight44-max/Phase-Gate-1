// create 20 spaces for the number car positions
// determine the length of the spaces
// compare the length of spaces with the postions, if the postion is 
// equal to the number of spaces, show a message "the position has been occupied"
// if its not equal then display " there is space left". 


const prompt = require('prompt-sync')();





console.log("WELLCOME TO DELIGHT PARKING SPACE");
console.log("   ");

let userinput = prompt("we have 20 spaces enter the positon to park "); 

let space = 0;

for(let index = 0; index < space.length; index++) {

if(userinput == space[index]) {

console.log("there is no space at positon " + userinput);

} else {

console.log("there is space at position " + userinput);

}  




