import sys, os, logging
print('Content-type: text/plain; charset=UTF-8\n\n')

content_len = int(os.environ["CONTENT_LENGTH"])
data = sys.stdin.read()

print("!RC=0")
print("MEMBERID=11929812")
print("IDSUF=1")
print("FILENAME=MA2D111929812.dat")
print("PASSWORD=1111")

