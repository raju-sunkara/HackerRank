def wrap(lst, max_width):
    str=[]
    for i in range(0, len(lst), max_width):
        str.append(lst[i:i + max_width])   
    return "\n".join(str)

if __name__ == '__main__':
    #string, max_width = input(), int(input())
    string="hellohowareyoudoing"
    max_width = 4
    result = wrap(string, max_width)
    print(result)