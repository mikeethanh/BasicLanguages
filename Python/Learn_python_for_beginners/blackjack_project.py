import random
suits =["spades","clubs","hearts","diamonds"]
ranks = ["A","2","3","4","5","6","7","8","9","10","J","Q","K"]
cards = []
# in ra cac quan trong bo bai

for rank in ranks:
    for suit in suits:
#         print(rank , suit)
          cards.append([suit,rank])
   

# xao tron cards
def shuffle():
    random.shuffle(cards)

def deal(number):
    cards_dealt = []
    for x in range(number):
        card = cards.pop()
        cards_dealt.append(card)
    return cards_dealt

shuffle()
# cards_dealt = deal(2)
# card = cards_dealt[0]
# rank = card[1]

# if rank == "A":
#     value = 11
# elif rank == "J" or rank == "Q" or rank == "K":
#     value = 10
# else:
#     value = rank

# rank_dict = {
#     "rank" : rank,
#     "value" : value
# }   
 
# print(rank_dict["rank"],rank_dict["value"])

# truy cap vao phan tu dau tien trong list
card = deal(1)[0]
print(card)