I am typing this information from memory.  I apologize if anything is incorrect.

How I set up a server (google can help you find more details for this):

-Install Apache Tomcat 9
-Configure Tomcat so that it uses port 80 instead of port 8080.
-Configure Tomcat so that it has cgi-bin
-Create a sub folder inside the cgi-bin called "filesv". Add the cgi files from this repository to your cgi-bin folder. Also add the example Mario Artist file.
-Compile and package the servlet with maven.  There should be a servlet WAR file inside of the TARGET folder.  Deploy the war file to your Tomcat server.
-Port forward to open port 80.

How to connect your 64DD to the internet:

1. Go to: https://64dd.org/pi/.  Follow the steps to install Randnet Pi onto your Dreampi.

2. On your dream pi you must edit the /etc/hosts file.  You can use the command:

sudo nano /etc/hosts

Add two lines like the following

127.0.0.1  mario.randnet.ne.jp
127.0.0.1  www.randnet.ne.jp

Replace "127.0.0.1" with the IP address of your server.

3.  Update the dnsmasq.conf using the command:

sudo nano /etc/dnsmasq.conf

Find the line that says "no-hosts" and comment it out with a # symbol.

4. Restart the Pi

5. You should be set up - with one exception the dreaded CHAP key.

6.  If your disks have been used in the past, I recommend dumping your disk to find the CHAP keys.  You can find the user information near the bottom of the file, in the middle of a large blanking space.
   If you know the user id, use control f and search the user id.  That should bring you to the user info.  It will look something like this:

00010 00065177 8876 K0J0P0+0O6U6#6M5 KLK+HB#A 00010 0004 225.6.7.8 U6#6M 9999  172.16.10.40:8080    172.16.10.41:8080

The CHAP key in this case is KLK+HB#A.  Your CHAP key should be located in the same spot.

7. You need to update Luigi Blood's python script with your CHAP key.  The python script is inside the RandnetPi directory on your raspberry pi.  Replace "K1QU0K@N" with your chap key. If your CHAP key has a special
   character in it like "#" you must write a \ before the character.  Look up python special characters on Google for more info.

8.  If you already have users, and you found your CHAP key, you will not be able to access the internet outside of your server on the Randnet disk.

9.  If you don't have a CHAP key, simply connect for the first time.  After connecting, go to connection settings, and select "00010" otherwise your modem will not turn on. This doesn't work for the Randnet disk exactly
Well it will work immediately after dialing up for the first time.  You can even access the entire web and not just your server. However, once you shut your DD off, it will break.  You will have to reset your user info
using the debug menu before trying again.

How to access debug menus:
For Mario Artist: On the title screen press: D-Pad Up, D-Pad Up, D-Pad Up, D-Pad Down, D-Pad Down, D-Pad Down, D-Pad Left, D-Pad Right, D-Pad Left, D-Pad Right, L Button, R Button.  Then press: D-Pad left and all the C
buttons.  This will open a menu. DO NOT CLICK ANYTHING as every option besides exit will delete data.  If you want to reset your member info press member info.
For Randnet:  type x-avefront://---.nixon_screen/html/testlink.html into the browser.  To reset member info, choose the first option, but be advised it may permenantly mess up your disk.  Once, the GetCommunicationsConfig
servlet is finished it should not mess anything up.
