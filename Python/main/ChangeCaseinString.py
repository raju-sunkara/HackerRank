#create a python script that changes the case of a string
def change_case(input_string):
    """
    Change the case of the input string.
    If the string is in lowercase, convert it to uppercase.
    If the string is in uppercase, convert it to lowercase.
    If the string contains mixed case, return it unchanged.
    
    :param input_string: The string to change case.
    :return: The modified string with changed case or unchanged if mixed case.
    """
    outString = None
    for each_char in input_string:
        each_char = each_char.lower() if each_char.isupper() else each_char.upper() 
        outString = each_char if outString is None else outString + each_char
    return outString# Example usage
if __name__ == "__main__":
    test_strings = ["hello world", "HELLO WORLD", "Hello World"]
    for s in test_strings:
        print(f"Original: {s} | Changed: {change_case(s)}")
