def get_age():
    age = int(input())

    if age < 18 or age > 75:
        raise ValueError ("Invalid age.")
    return age


def fat_burning_heart_rate(age):
    heart_rate = (220 - age) * 0.7
    return heart_rate

if __name__ == "__main__":

    try:
        person_age = get_age()
        print("Fat burning heart rate for a {} year-old: {} bpm".format(person_age, fat_burning_heart_rate(person_age)))
    except ValueError as e:
        print(e)
        print("Could not calculate heart rate info.")
    
    