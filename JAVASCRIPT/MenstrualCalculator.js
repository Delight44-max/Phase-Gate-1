// Step 1: Get user input

// Step 2: Convert inputs

// Step 3: Calculate next period

// Step 4: Calculate ovulation (14 days before next period)

// Step 5: Fertile window (5 days before ovulation to ovulation day)

// Step 6: Display results using toDateString()


const prompt = require('prompt-sync')();

function calculateOvulation() {
  
  const lastPeriodInput = prompt("Enter the start date of your last period (yyyy-MM-dd): ");
  const cycleLengthInput = prompt("Enter your cycle length (e.g., 28): ");

 
  const lastPeriodDate = new Date(lastPeriodInput);
  const cycleLength = parseInt(cycleLengthInput, 10);

 
  const nextPeriodDate = new Date(lastPeriodDate);
  nextPeriodDate.setDate(lastPeriodDate.getDate() + cycleLength);

  
  const ovulationDate = new Date(nextPeriodDate);
  ovulationDate.setDate(nextPeriodDate.getDate() - 14);

  
  const fertileStart = new Date(ovulationDate);
  fertileStart.setDate(ovulationDate.getDate() - 5);

  const fertileEnd = new Date(ovulationDate);

  
  console.log(" Your next period is expected on: " + nextPeriodDate.toDateString());
  console.log("Your ovulation day is: " + ovulationDate.toDateString());
  console.log(" Your fertile window is: " + fertileStart.toDateString() + " to " + fertileEnd.toDateString());
}

calculateOvulation();