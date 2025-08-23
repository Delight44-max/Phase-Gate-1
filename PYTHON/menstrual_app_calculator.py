# Step 1: Get user input

# Step 2: Convert inputs

# Step 3: Calculate next period

# Step 4: Calculate ovulation (14 days before next period)

# Step 5: Fertile window (5 days before ovulation to ovulation day)

# Step 6: Display results



from datetime import datetime, timedelta

def get_next_period():
    day = int(input("Enter the day your last period started (e.g., 23): "))
    month = int(input("Enter the month (e.g., 8 for August): "))
    year = int(input("Enter the year (e.g., 2025): "))
    cycle_length = int(input("Enter your cycle length (e.g., 28): "))

    start_date = datetime(year, month, day)
    next_period = start_date + timedelta(days=cycle_length)
    return next_period

def calculate_ovulation():
    days_before_ovulation = 14
    sperm_lifespan = 5

    next_period = get_next_period()
    ovulation_day = next_period - timedelta(days=days_before_ovulation)
    fertile_start = ovulation_day - timedelta(days=sperm_lifespan)
    fertile_end = ovulation_day

    print("Ovulation Day:", ovulation_day.date())
    print("Fertile Window: From", fertile_start.date(), "to", fertile_end.date())

    # Safe and Unsafe Day Messages
    print("Safe Days: Before", fertile_start.date(), "and after", fertile_end.date())
    print("Unsafe Days: From", fertile_start.date(), "to", fertile_end.date(), "— high chance of pregnancy if you have unprotected sex")

calculate_ovulation()