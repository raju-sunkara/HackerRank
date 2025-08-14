'''Mr. Vincent works in a door mat manufacturing company. One day, he designed a new door mat with the following specifications:

Mat size must be X. ( is an odd natural number, and  is  times .)
The design should have 'WELCOME' written in the center.

Input Format

A single line containing the space separated values of  and .

Constraints

Output Format

Output the design pattern.

Sample Input

9 27
Sample Output

------------.|.------------
---------.|..|..|.---------
------.|..|..|..|..|.------
---.|..|..|..|..|..|..|.---
----------WELCOME----------
---.|..|..|..|..|..|..|.---
------.|..|..|..|..|.------
---------.|..|..|.---------
------------.|.------------

'''
n=9
m=27
# Read input
#n, m = map(int, input().split())


# Top part
for i in range(1, n, 2):
    print(('.|.' * i).center(m, '-'))

# Middle part
print('WELCOME'.center(m, '-'))

# Bottom part
for i in range(n-2, 0, -2):
    print(('.|.' * i).center(m, '-'))


for i in range(1, n, 2):
    for j in range(1, m, 1):
        print('-'.strip(),end='')
    print('\n')