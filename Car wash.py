services = { 'Air freshener' : 1 , 'Rain repellent': 2, 'Tire shine' : 2, 'Wax' : 3, 'Vacuum' : 5 }

base_wash = 10
total = 0
service_choice1 = input()
service_choice2 = input()
total = 10
print("ZyCar Wash")
print("Base car wash -- $10")

if service_choice1 in services.keys():
    print(service_choice1+" -- $" + str(services[service_choice1]))
    total += services[service_choice1]
if service_choice2 in services.keys():
    print(service_choice2+" -- $" + str(services[service_choice2]))
    total += services[service_choice2]
print("----")
print("Total price: $" + str(total))