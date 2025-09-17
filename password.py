import re

def check_password(password):
    if len(password) < 6:
        return "Too short!"
    elif not re.search(r"[A-Z]", password):
        return "Add an uppercase letter!"
    elif not re.search(r"[0-9]", password):
        return "Add a number!"
    else:
        return "Strong password!"

print(check_password("helloWorld1"))
