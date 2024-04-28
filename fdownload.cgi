import sys, os, logging

content_len = int(os.environ["CONTENT_LENGTH"])
data = sys.stdin.read()

print('Content-type: text/plain; charset=UTF-8\n\n')
print("!RC=0")
print("CONTRIBUTENAME=Mountains")
print("FILEID=MA2D1")
print("COMMENT=DESC")
print("CSIZE=11690")
print("ISIZE=13846")

#MUST ALSO SEND THE FILE BACK SOMEHOW
#filename="MA2D111929812.dat"
#file = open(filename, 'rb')
#print("Content-type: application/octet-stream")
#print("Content-Disposition: attachment; filename=%s" %(filename))
#print()
#print(file.read())

file.close()
