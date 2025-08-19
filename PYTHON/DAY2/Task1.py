def age_checker(sonsAge, fathersAge ):
    ageOne = sonsAge *2;
    fathersAgeYearsAgo = fathersAge - ageOne;

    return fathersAgeYearsAgo;

result = age_checker(13, 50)
print(" the fathers is ",  result, " years older than his son ")
    