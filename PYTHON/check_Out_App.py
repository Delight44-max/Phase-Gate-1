def product_details():
    print("SEMICOLON STORES\n")
    print("PRODUCTS AND PRICES\n")
    print("CASHIER APP\n")

    customers_name = input("WHAT IS THE CUSTOMER'S NAME: ")
    print()

    customers_purchase = input("WHAT DID THE USER BUY? ")
    print()

    quantity = int(input("HOW MANY PIECES?: "))
    print()

    unit_price = float(input("HOW MUCH PER UNIT ₦: "))
    print()

    cashier_name = input("WHAT IS YOUR NAME?: ")
    print()

    discount1 = float(input("HOW MUCH DISCOUNT PERCENTAGE WILL HE GET?: "))
    print()

    items = input("ADD MORE ITEMS?: ").upper()
    print()

    customer_second_purchase = input("WHAT DID THE USER BUY? ")
    print()

    second_quantity = int(input("HOW MANY PIECES?: "))
    print()

    second_unit_price = float(input("HOW MUCH PER UNIT ₦: "))
    print()

    discount2 = float(input("HOW MUCH DISCOUNT WILL HE GET?: "))
    print()

    first_unit_total = unit_price * quantity
    second_unit_total = second_unit_price * second_quantity
    subtotal = first_unit_total + second_unit_total

    discount_percentage = (discount1 + discount2) / 100
    discount_amount = subtotal * discount_percentage
    total_discount = discount_amount

    vat = (subtotal * 7.5) / 100
    bill_total = subtotal - total_discount + vat

    print("\nSEMICOLON STORES RECEIPT\n")
    print("MAIN BRANCH")
    print("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.")
    print("TEL: 8158869243")
    from datetime import datetime
    print("Date:", datetime.now().strftime("%Y-%m-%d %H:%M:%S"))
    print("Cashier:", cashier_name)
    print("Customer Name:", customers_name)
    print("=" * 55)
    print("ITEM\tQTY\tPRICE\tTOTAL(NGN)")
    print("-" * 55)
    print(f"{customers_purchase}\t{quantity}\t₦{unit_price:.2f}\t₦{first_unit_total:.2f}")
    print(f"{customer_second_purchase}\t{second_quantity}\t₦{second_unit_price:.2f}\t₦{second_unit_total:.2f}")
    print("-" * 55)
    print(f"Sub Total: ₦{subtotal:.2f}")
    print(f"Discount: ₦{total_discount:.2f}")
    print(f"VAT @ 7.5%: ₦{vat:.2f}")
    print("=" * 55)
    print(f"Bill Total: ₦{bill_total:.2f}")
    print("=" * 55)
    print(f"THIS IS NOT A RECEIPT. KINDLY PAY: ₦{bill_total:.2f}")
    print()

    amount_paid = float(input("HOW MUCH DID THE CUSTOMER GIVE YOU: "))
    balance = amount_paid - bill_total

    print(f"Amount Paid: ₦{amount_paid:.2f}")
    print(f"Balance: ₦{balance:.2f}")
    print("=" * 55)
    print("THANK YOU FOR YOUR PATRONAGE")
    print("=" * 55)


product_details()
