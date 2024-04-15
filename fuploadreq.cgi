import cgi, sys, os, logging
import cgitb; cgitb.enable()
form = cgi.FieldStorage()
print('Content-type: text/plain; charset=UTF-8\n\n')
sys.path.insert(0, os.getcwd())

logging.basicConfig(filename='app.log', filemode='w', format='%(name)s - %(levelname)s - %(message)s')
logging.warning(form)

message = None

# TO DO: Verify that the file is not spam otherwise anyone can upload anything
if 'UPLOADDATA' in form:
    fileitem = form['UPLOADDATA']
    fn = os.path.basename(fileitem.filename)
    open('/home/tim/Randnet/' fn, 'wb').write(fileitem.file.read()) #REPLACE the /home/tim/Randnet with whatever directory you want to save the file in
    logging.warn('The file "' + fn + '" was uploaded successfully')
else:
    logging.warn('No file was uploaded')

print("!RC=0")
print("FILENAME=12345678") #TO DO: Autogenerate file name and passwords.  Users can use these in the download exchange box to access your uploads
print("PASSWORD=1111")
