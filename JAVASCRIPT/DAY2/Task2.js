function Getscore(firstScore, secondScore, ThirdScore) {


let totalScore = (firstScore + secondScore  + ThirdScore) / 3;

if(totalScore >= 90 && totalScore < 100){ 
return 'A';

} 
else if(totalScore >= 80 && totalScore < 90){
return 'B';

}

else if( totalScore >= 90 && totalScore < 70){
return 'C';

}

else if( totalScore >= 80 && totalScore < 90){
return 'D';

}


else {

return 'F';
}
}

let result = Getscore(10 ,50 ,60)
console.log(result)