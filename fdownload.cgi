import sys, os, logging

content_len = int(os.environ["CONTENT_LENGTH"])
data = sys.stdin.read()

filename="MA2D111929812.dat"
file = open(filename, 'rb')
print("Content-type: application/octet-stream")
print("Content-Disposition: attachment; filename=%s" %(filename))
print()
print(file.read())

file.close()
