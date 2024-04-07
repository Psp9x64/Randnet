import sys, os, logging

content_len = int(os.environ["CONTENT_LENGTH"])
data = sys.stdin.read()

print('Content-type: text/plain; charset=UTF-8\n\n')
print("!RC=0")
print("MEMBERID=11929812")
print("IDSUF=1")
print("FILENAME=Mountains")
print("PASSWORD=1111")
