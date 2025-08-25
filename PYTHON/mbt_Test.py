def all_questions():
    print("FREE PERSONALITY TEST\n")
    print("Please select (A) or (B)\n")

    # ---------- Question 1 ----------
    print("1. You regularly make new friends.")
    print("(A) AGREE")
    print("(B) DISAGREE")
    answer_one = input("Your answer: ").upper()
    if answer_one not in ["A", "B"]:
        print("Invalid choice! Please enter A or B.")
        return

    # ---------- Question 2 ----------
    print("\n2. You can easily connect with people you have just met.")
    print("(A) AGREE")
    print("(B) DISAGREE")
    answer_two = input("Your answer: ").upper()
    if answer_two not in ["A", "B"]:
        print("Invalid choice! Please enter A or B.")
        return

    # ---------- Question 3 ----------
    print("\n3. If your plans are interrupted, your top priority is to get back on track as soon as possible.")
    print("(A) AGREE")
    print("(B) DISAGREE")
    answer_three = input("Your answer: ").upper()
    if answer_three not in ["A", "B"]:
        print("Invalid choice! Please enter A or B.")
        return

    # ---------- Question 4 ----------
    print("\n4. You are still bothered by mistakes that you made a long time ago.")
    print("(A) AGREE")
    print("(B) DISAGREE")
    answer_four = input("Your answer: ").upper()
    if answer_four not in ["A", "B"]:
        print("Invalid choice! Please enter A or B.")
        return

    # ---------- Question 5 ----------
    print("\n5. Your emotions control you more than you control them.")
    print("(A) AGREE")
    print("(B) DISAGREE")
    answer_five = input("Your answer: ").upper()
    if answer_five not in ["A", "B"]:
        print("Invalid choice! Please enter A or B.")
        return

    # ---------- Display Results ----------
    print("\nThe options you selected are:\n")
    print("1.", answer_one)
    print("2.", answer_two)
    print("3.", answer_three)
    print("4.", answer_four)
    print("5.", answer_five)

    # Personality result (simple check)
    if answer_one == "A" or answer_two == "A":
        print("\nBased on your answers you are an Extrovert")
    else:
        print("\nBased on your answers you are an Introvert")


all_questions()