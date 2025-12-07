# ------------------------------
# Simple Fiction-Based Adventure
# ------------------------------

def intro():
    print("\n=== WELCOME TO THE REALM OF SHADOWVALE ===")
    print("You awaken in a dimly lit forest. A cold wind whistles through the trees.\n")
    print("A narrow path leads NORTH. A faint glow pulses to the EAST.")
    print("What will you do?\n")

def forest_path():
    print("\nYou walk north along the rough forest path.")
    print("The trees thin out, revealing an abandoned watchtower.")
    print("Do you:")
    print("1) Enter the watchtower")
    print("2) Return to the clearing")

    choice = input("> ").strip()
    if choice == "1":
        watchtower()
    else:
        start()

def glowing_light():
    print("\nYou move toward the pale glow.")
    print("A floating crystal hovers above an ancient rune circle.")
    print("Do you:")
    print("1) Touch the crystal")
    print("2) Walk away")

    choice = input("> ").strip()
    if choice == "1":
        crystal_event()
    else:
        start()

def watchtower():
    print("\nInside the watchtower, you find dusty stairs leading up.")
    print("At the top, a raven with glowing red eyes speaks:")
    print("\"Turn back… or embrace your fate.\"")
    print("Do you:")
    print("1) Talk to the raven")
    print("2) Attack the raven")
    print("3) Run away")

    choice = input("> ").strip()
    if choice == "1":
        print("\nThe raven tells you secrets—your destiny is intertwined with Shadowvale.")
        ending("THE ORACLE OF FEATHERS ENDING")
    elif choice == "2":
        print("\nThe raven vanishes in a puff of smoke. You feel a curse fall upon you.")
        ending("THE CURSED WATCHER ENDING")
    else:
        start()

def crystal_event():
    print("\nThe moment your hand touches the crystal, visions flood your mind.")
    print("You see kingdoms rising and falling… and yourself at the center of it all.")
    print("Do you accept the visions? (yes/no)")

    choice = input("> ").strip().lower()
    if choice == "yes":
        ending("THE CHOSEN SEER ENDING")
    else:
        ending("THE FORGOTTEN DREAMER ENDING")

def ending(title):
    print("\n==============================")
    print(f"        {title}")
    print("==============================")
    print("Thank you for playing!")
    exit()

def start():
    print("\nYou stand once again in the forest clearing.")
    print("Where will you go?")
    print("1) NORTH — toward the forest path")
    print("2) EAST — toward the glowing light")

    choice = input("> ").strip()
    if choice == "1":
        forest_path()
    else:
        glowing_light()

# Run the game
intro()
start()
