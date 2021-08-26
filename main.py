# # def printEveIndexChar(str):
# #   for i in range(0, len(str)-1):
# #       if i%2 ==0:
# #         print("index[",i,"]", str[i] )

# # inputStr = "Macharia" 
# # # call function
# # printEveIndexChar(inputStr)


# from getpass import getpass
# password = getpass()

# def checkPin(guess, PIN, BlockedPIN, PIN_COUNT):
#   if guess != PIN and PIN_COUNT <= blockPIN and not(BlockedPIN):
#     guess = input("Enter your PIN: ")
#     PIN_COUNT += 1
#     checkPin(guess, PIN, BlockedPIN, PIN_COUNT)
#   else:
#     BlockedPIN = True


# PIN = "1234"
# guess = ""
# PIN_COUNT = 1
# blockPIN = 3
# BlockedPIN = False
# checkPin(guess, PIN, BlockedPIN, PIN_COUNT)

# if BlockedPIN:
#     print("PIN Blocked. You entered incorrect PIN 3 times!")
# else:
#     print("PIN correct. You may transact!")

# from getpass import getpass
# PIN = "1234"
# guess = ""
# PIN_COUNT = 1
# blockPIN = 3
# BlockedPIN = False
# while guess != PIN and not(BlockedPIN):
#   if PIN_COUNT <= blockPIN:
#     guess = getpass('Enter your PIN: ')
#     PIN_COUNT += 1
#   else:
#     BlockedPIN = True
# if BlockedPIN:
#     print("PIN Blocked. You entered incorrect PIN 3 times!")
# else:
#     print("PIN correct. You may transact!")


for x in range(0, 20, 5):
  liste=[]
  for y in range(x, x+5):
    liste.append(y)
  print(liste)
