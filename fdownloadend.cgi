import sys, os, logging

content_len = int(os.environ["CONTENT_LENGTH"])
data = sys.stdin.read()

print('Content-type: text/plain; charset=UTF-8\n\n')
print("!RC=0")
