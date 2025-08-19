def get_score(scoreone, scoretwo, scorethree):

    average = (scoreone + scoretwo + scorethree) / 3
    if(average >= 90 and average < 100 ):
        return 'A'


    elif(average >= 80 and average < 90):
        return 'B'


    
    elif(average >= 90 and average < 70):
        return 'C'


    elif(average >= 80 and average < 90):
        return 'D'

    else:
        return 'F'

print(get_score(50, 40, 60))
    