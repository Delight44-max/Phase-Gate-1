function ageChecker(sonsAge, fathersAge){

let ageOne = sonsAge *2;

let fathersAgeYearsAgo = fathersAge - ageOne;

return fathersAgeYearsAgo;

}


console.log("the fathers was " + ageChecker(13,50) + " older than his son");
