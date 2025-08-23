const prompt = require('prompt-sync')();



function nextPeriodDetails() {
const userInput = prompt("ENTER THE START DATE OF YOUR LAST PERIOD (yyyy-MM-dd): ");
const startDate = new Date(userInput);

const cycleLength = parseInt(prompt("ENTER YOUR CYCLE LENGTH (e.g., 28):"), 10);

const nextPeriod = new Date(startDate);
nextPeriod.setDate(startDate.getDate() + cycleLength);

    return nextPeriod;
}

function ovulationPeriod() {
const beforeOvulation = 14;
 const spermLifeSpan = 5;

const nextPeriod = nextPeriodDetails();

const ovulationDate = new Date(nextPeriod);
ovulationDate.setDate(nextPeriod.getDate() - beforeOvulation);

const fertileStart = new Date(ovulationDate);
fertileStart.setDate(ovulationDate.getDate() - spermLifeSpan);

const fertileEnd = new Date(ovulationDate);

console.log("Your ovulation day is: " + ovulationDate.toISOString().split('T')[0] + " --- high possibility of pregnancy if you have sex");
console.log("Your fertile window starts on: " + fertileStart.toISOString().split('T')[0] + " --- tendency of pregnancy is low");
console.log("Your fertile window ends on: " + fertileEnd.toISOString().split('T')[0] + " --- the chance of getting pregnant is very low, almost impossible");

}


ovulationPeriod();