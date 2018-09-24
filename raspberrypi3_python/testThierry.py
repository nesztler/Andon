 #!/usr/bin/python
 #-*- coding: utf-8 -*-

import mysql.connector

conn = mysql.connector.connect(host="nesztler3227.hopto.org",user="root",password="carolien", database="tlcd_andon")
cursor = conn.cursor()
cursor.execute("""SELECT * FROM tlcd""")
lignes = cursor.fetchall()

for line in lignes:
    print line

conn.close()