const prompt = require("prompt-sync")(); 


let studentCount = parseInt(prompt("Enter number of students: "));
let subjectCount = parseInt(prompt("Enter number of subjects: "));

let topStudent = "";
let topScore = -1;

let studentIndex = 1;
while (studentIndex <= studentCount) {
  console.log("\nStudent " + studentIndex);

  let subjectIndex = 1;
  let total = 0;

  while (subjectIndex <= subjectCount) {
    let score = parseFloat(prompt("Enter score for Subject " + subjectIndex + ": "));
    total = total + score;
    subjectIndex = subjectIndex + 1;
  }

  let average = total / subjectCount;
  console.log("Total:", total, "Average:", average.toFixed(2));

  if (total > topScore) {
    topScore = total;
    topStudent = "Student " + studentIndex;
  }

  studentIndex = studentIndex + 1;
}

console.log("\nTop Performer:", topStudent, "with total score of", topScore);
