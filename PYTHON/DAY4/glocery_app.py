def print_list(grocery_list):
    print("\n=== Grocery List ===")
    if not grocery_list:
        print("No items in the list.")
    else:
        for i, item in enumerate(grocery_list, start=1):
            print(f"{i}. {item}")

def grocery_app():
    store = []
    choice = None

    while choice != "0":
        choice = input(
            "\n=== Select Menu ===\n"
            "1. Add item\n"
            "2. Remove item\n"
            "3. Show available items\n"
            "0. Exit\n\n"
            "Select a function from (1-3) or 0 to exit: "
        )

        if choice == "1":
            item = input("Enter item to add: ")
            if item.strip():
                store.append(item.strip())
                print(f"{item} added to the list.")
            else:
                print("Item cannot be empty.")

        elif choice == "2":
            if not store:
                print("No items to remove.")
                continue

            print_list(store)
            index_input = input("Enter item number to remove: ")

            if index_input.isdigit():
                index = int(index_input)
                if 1 <= index <= len(store):
                    removed_item = store.pop(index - 1)
                    print(f"{removed_item} removed from the list.")
                else:
                    print("Invalid item number.")
            else:
                print("Please enter a valid number.")

        elif choice == "3":
            print_list(store)

        elif choice == "0":
            print("Exiting the app. Goodbye!")

        else:
            print("Invalid choice. Please select between 0 and 3.")

grocery_app()