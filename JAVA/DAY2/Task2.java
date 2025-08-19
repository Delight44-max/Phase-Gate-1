public class Task2 {

public static void main(String[] args){

System.out.println(checkScore(5,45,50));


}


public static char checkScore(int firstScore, int secondScore, int ThirdScore ) {

int totalScore = (firstScore + firstScore + ThirdScore) / 3;

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
}