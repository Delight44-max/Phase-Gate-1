card_number = input("Enter your credit card number: ")

if len(card_number) < 13 or len(card_number) > 16:
    print("Invalid credit card number!")
    exit()

card_digits = [int(digit) for digit in card_number]

if card_digits[0] == 4:
    print("\n<<<< credit card type: VISA CARD")
elif card_digits[0] == 5:
    print("\n<<<< credit card type: MASTERCARD")
elif card_digits[0] == 3 and card_digits[1] == 7:
    print("\n<<<< credit card type: AMERICAN EXPRESS CARD")
elif card_digits[0] == 6:
    print("\n<<<< credit card type: DISCOVER CARD")
else:
    print("CARD NOT RECOGNIZED!")

print("<<<< credit card Number:", card_number)
print("<<<< credit card Digit:", len(card_number))