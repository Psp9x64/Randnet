import sys, os, logging
print('Content-type: text/plain; charset=UTF-8\n\n')

content_len = int(os.environ["CONTENT_LENGTH"])
data = sys.stdin.read()

print("!RC=0")
