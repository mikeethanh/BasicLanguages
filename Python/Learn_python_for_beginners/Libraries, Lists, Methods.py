import random
# random library:
def get_choices() :
    player_choice =input("enter your choice: ")
    options = ["rock","paper","scissors"]
    computer_choice = random.choice(options)
    choices = {
        "player":player_choice,
        "computer":computer_choice
    }
    return choices

# funtion arguments
def check_win(player,computer) :
    # f-stirng
    print(f"you choose{player},computer:{computer}")
    return [player,computer]

result = check_win("rock", "scissors")
print(result)

