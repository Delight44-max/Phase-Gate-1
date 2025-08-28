student_count = int(input("Enter number of students: "))
subject_count = int(input("Enter number of subjects: "))

top_student = ""
top_score = -1

student_index = 1
while student_index <= student_count:
    print(f"\nStudent {student_index}")
    total = 0
    subject_index = 1

    while subject_index <= subject_count:
        score = float(input(f"Enter score for Subject {subject_index}: "))
        total += score
        subject_index += 1

    average = total / subject_count
    print(f"Total: {total} Average: {average:.2f}")

    if total > top_score:
        top_score = total
        top_student = f"Student {student_index}"

    student_index += 1

print(f"\nTop Performer: {top_student} with total score of {top_score}")
