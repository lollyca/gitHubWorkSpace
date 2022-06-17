user_input = input()
entries = user_input.split(" ")
info = {}
contact = input()

for pair in entries:
    split_pair = pair.split(',')
    info[split_pair[0]] = split_pair[1]
    if (split_pair[0] == contact):
        print(split_pair[1])