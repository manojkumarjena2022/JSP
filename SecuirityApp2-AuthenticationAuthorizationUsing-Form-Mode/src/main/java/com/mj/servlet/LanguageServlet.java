/*
 * put below content in tomcat-users.xml
 * <role rolename="ROLE_CUSTOMER"/>
  <role rolename="ROLE_CLERK"/>
  <role rolename="ROLE_MANAGER"/>
  <user username="mj" password="mj@1234" roles="ROLE_CLERK"/>
  <user username="manoj" password="manoj@1234" roles="ROLE_MANAGER,ROLE_CLERK"/>
  <user username="kumar" password="kumar@1234" roles="ROLE_CUSTOMER"/>*/
package com.mj.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/languages")
public class LanguageServlet extends HttpServlet {
@Override
protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	//get writer
	PrintWriter pw=res.getWriter();
	//print response
	pw.println("<h1>Languages Spoken in Different Countries</h1>");
	pw.println("<h3>Auth Mode :"+req.getAuthType()+"</h3>");
	pw.println("<h3>Logged In User Name :"+req.getRemoteUser()+"</h3>");
	pw.print("<ol><li>English</li>"
			+ "        <li>Spanish</li>"
			+ "        <li>Chinese (Mandarin)</li>"
			+ "        <li>Hindi</li>"
			+ "        <li>Arabic</li>"
			+ "        <li>French</li>"
			+ "        <li>Urdu</li>"
			+ "        <li>Bengali</li>"
			+ "        <li>Portuguese</li>"
			+ "        <li>Russian</li>"
			+ "        <li>Japanese</li>"
			+ "        <li>German</li>"
			+ "        <li>Punjabi</li>"
			+ "        <li>Javanese</li>"
			+ "        <li>Wu (Shanghainese)</li>"
			+ "        <li>Telugu</li>"
			+ "        <li>Marathi</li>"
			+ "        <li>Tamil</li>"
			+ "        <li>Turkish</li>"
			+ "        <li>Italian</li>"
			+ "        <li>Thai</li>"
			+ "        <li>Korean</li>"
			+ "        <li>Gujarati</li>"
			+ "        <li>Polish</li>"
			+ "        <li>Ukrainian</li>"
			+ "        <li>Swahili</li>"
			+ "        <li>Romanian</li>"
			+ "        <li>Tagalog</li>"
			+ "        <li>Dutch</li>"
			+ "        <li>Kurdish</li>"
			+ "        <li>Nepali</li>"
			+ "        <li>Sinhala</li>"
			+ "        <li>Malayalam</li>"
			+ "        <li>Amharic</li>"
			+ "        <li>Kannada</li>"
			+ "        <li>Oromo</li>"
			+ "        <li>Assamese</li>"
			+ "        <li>Kazakh</li>"
			+ "        <li>Serbian</li>"
			+ "        <li>Haitian Creole</li>"
			+ "        <li>Burmese</li>"
			+ "        <li>Hmong</li>"
			+ "        <li>Zulu</li>"
			+ "        <li>Slovak</li>"
			+ "        <li>Tigrinya</li>"
			+ "        <li>Albanian</li>"
			+ "        <li>Uzbek</li>"
			+ "        <li>Swedish</li>"
			+ "        <li>Azerbaijani</li>"
			+ "        <li>Khmer</li>"
			+ "        <li>Sinhalese</li>"
			+ "        <li>Belarusian</li>"
			+ "        <li>Tajik</li>"
			+ "        <li>Malagasy</li>"
			+ "        <li>Thai</li>"
			+ "        <li>Lao</li>"
			+ "        <li>Khmer</li>"
			+ "        <li>Myanmar</li>"
			+ "        <li>Sinhalese</li>"
			+ "        <li>Tamil</li>"
			+ "        <li>Mongolian</li>"
			+ "        <li>Turkmen</li>"
			+ "        <li>Uyghur</li>"
			+ "        <li>Kazakh</li>"
			+ "        <li>Tibetan</li>"
			+ "        <li>Kyrgyz</li>"
			+ "        <li>Malay</li>"
			+ "        <li>Indonesian</li>"
			+ "        <li>Swahili</li>"
			+ "        <li>Yoruba</li>"
			+ "        <li>Igbo</li>"
			+ "        <li>Hausa</li>"
			+ "        <li>Zulu</li>"
			+ "        <li>Afrikaans</li>"
			+ "        <li>Amharic</li>"
			+ "        <li>Somali</li>"
			+ "        <li>Shona</li>"
			+ "        <li>Igbo</li>"
			+ "        <li>Xhosa</li>"
			+ "        <li>Zulu</li>"
			+ "        <li>Hausa</li>"
			+ "        <li>Luganda</li>"
			+ "        <li>Sango</li>"
			+ "        <li>Nyanja</li>"
			+ "        <li>Chewa</li>"
			+ "        <li>Tswana</li>"
			+ "        <li>Sesotho</li>"
			+ "        <li>Venda</li>"
			+ "        <li>Tsonga</li>"
			+ "        <li>Xitsonga</li>"
			+ "        <li>Kinyarwanda</li>"
			+ "        <li>Kirundi</li>"
			+ "        <li>Swazi</li>"
			+ "        <li>Seselwa Creole French</li>"
			+ "        <li>Mauritian Creole</li>"
			+ "        <li>Bemba</li>"
			+ "        <li>Sotho</li>"
			+ "        <li>Kongo</li>"
			+ "        <li>Wolof</li>"
			+ "        <li>Fula</li>"
			+ "        <li>Malagasy</li>"
			+ "        <li>Akan</li>"
			+ "        <li>Umbundu</li>"
			+ "        <li>Lingala</li>"
			+ "        <li>Zande</li>"
			+ "        <li>Luhya</li>"
			+ "        <li>Makonde</li>"
			+ "        <li>Sukuma</li>"
			+ "        <li>Ganda</li>"
			+ "        <li>Kamba</li>"
			+ "        <li>Rundi</li>"
			+ "        <li>Chichewa</li>"
			+ "        <li>Mende</li>"
			+ "        <li>Bambara</li>"
			+ "        <li>Soussou</li>"
			+ "        <li>Twi</li>"
			+ "        <li>Fulfulde</li>"
			+ "        <li>Hausa</li>"
			+ "        <li>Sango</li>"
			+ "        <li>Bambara</li>"
			+ "        <li>Dioula</li>"
			+ "        <li>Maninka</li>"
			+ "        <li>Tigrinya</li>"
			+ "        <li>Oromo</li>"
			+ "        <li>Sidama</li>"
			+ "        <li>Gurage</li>"
			+ "        <li>Saho</li>"
			+ "        <li>Afar</li>"
			+ "        <li>Beja</li>"
			+ "        <li>Hausa</li>"
			+ "        <li>Igbo</li>"
			+ "        <li>Fulfulde</li>"
			+ "        <li>Wolof</li>"
			+ "        <li>Serere</li>"
			+ "        <li>Nyanja</li>"
			+ "        <li>Tumbuka</li>"
			+ "        <li>Chewa</li>"
			+ "        <li>Lunda</li>"
			+ "        <li>Luvale</li>"
			+ "        <li>Nyika</li>"
			+ "        <li>Ndebele</li>"
			+ "        <li>Tswana</li>"
			+ "        <li>Sotho</li>"
			+ "        <li>Swazi</li>"
			+ "        <li>Zulu</li>"
			+ "        <li>Xhosa</li>"
			+ "        <li>Swazi</li>"
			+ "        <li>Sotho</li>"
			+ "        <li>Venda</li>"
			+ "        <li>Tsonga</li>"
			+ "        <li>Xitsonga</li>"
			+ "        <li>Kinyarwanda</li>"
			+ "        <li>Kirundi</li>"
			+ "        <li>Tigrinya</li>"
			+ "        <li>Oromo</li>"
			+ "        <li>Sidama</li>"
			+ "        <li>Gurage</li>"
			+ "        <li>Saho</li>"
			+ "        <li>Afar</li>"
			+ "        <li>Beja</li>"
			+ "        <li>Kinyarwanda</li>"
			+ "        <li>Kirundi</li>"
			+ "        <li>Amharic</li>"
			+ "        <li>Gamo</li>"
			+ "        <li>Harari</li>"
			+ "        <li>Gedeo</li>"
			+ "        <li>Silt'e</li>"
			+ "        <li>Wolaitta</li>"
			+ "        <li>Walayta</li>"
			+ "        <li>Kefficho</li>"
			+ "        <li>Argobba</li>"
			+ "        <li>Gurage</li>"
			+ "        <li>Hadiyya</li>"
			+ "        <li>Hadiyya</li>"
			+ "        <li>Gurage</li>"
			+ "        <li>Konso</li>"
			+ "        <li>Bench</li>"
			+ "        <li>Gamo</li>"
			+ "        <li>Dirasha</li>"
			+ "        <li>Silt'e</li>"
			+ "        <li>Dawro</li>"
			+ "        <li>Aari</li>"
			+ "        <li>Shekkacho</li>"
			+ "        <li>Dime</li>"
			+ "        <li>Derashe</li>"
			+ "        <li>Alaba</li>"
			+ "        <li>Konso</li>"
			+ "        <li>Sodo</li>"
			+ "        <li>Selam</li>"
			+ "        <li>Yebaruso</li>"
			+ "        <li>Bench</li>"
			+ "        <li>Surma</li>"
			+ "        <li>Me'en</li>"
			+ "        <li>Maale</li>"
			+ "        <li>Goffa</li>"
			+ "        <li>Gofa</li>"
			+ "        <li>Gemara</li>"
			+ "        <li>Afar</li>"
			+ "        <li>Dawro</li>"
			+ "        <li>Alaba</li>"
			+ "        <li>Shekkacho</li>"
			+ "        <li>Dime</li>"
			+ "        <li>Derashe</li>"
			+ "        <li>Me'en</li>"
			+ "        <li>Gamila</li>"
			+ "        <li>Maale</li>"
			+ "        <li>Kacha</li>"
			+ "        <li>Gofa</li>"
			+ "        <li>Gamira</li>"
			+ "        <li>Awngi</li>"
			+ "        <li>Weyto</li>"
			+ "        <li>Komo</li>"
			+ "        <li>Kaficho</li>"
			+ "        <li>Boro</li>"
			+ "        <li>Mezhenger</li>"
			+ "        <li>Mursi</li>"
			+ "        <li>Dizi</li>"
			+ "        <li>Melo</li>"
			+ "        <li>Dime</li>"
			+ "        <li>Walamo</li>"
			+ "        <li>Silt'e</li>"
			+ "        <li>Gofa</li>"
			+ "        <li>Yem</li>"
			+ "        <li>Majang</li>"
			+ "        <li>Gamila</li>"
			+ "        <li>Aari</li>"
			+ "        <li>Shekkacho</li>"
			+ "        <li>Surma</li>"
			+ "        <li>Me'en</li>"
			+ "        <li>Gamila</li>"
			+ "        <li>Hamer</li>"
			+ "        <li>Bashada</li>"
			+ "        <li>Arbore</li>"
			+ "        <li>Chaha</li>"
			+ "        <li>Dawro</li>"
			+ "        <li>Sidama</li>"
			+ "        <li>Gurage</li>"
			+ "        <li>Konso</li>"
			+ "        <li>Alaba</li>"
			+ "        <li>Yem</li>"
			+ "        <li>Majang</li>"
			+ "        <li>Gamila</li>"
			+ "        <li>Koyra</li>"
			+ "        <li>Shekkacho</li>"
			+ "        <li>Surma</li>"
			+ "        <li>Me'en</li>"
			+ "        <li>Berta</li>"
			+ "        <li>Shabo</li>"
			+ "        <li>Maba</li>"
			+ "        <li>Fur</li>"
			+ "        <li>Beja</li>"
			+ "        <li>Hadareb</li>"
			+ "        <li>Afar</li>"
			+ "        <li>Kunama</li>"
			+ "        <li>Nara</li>"
			+ "        <li>Noban Tana</li>"
			+ "        <li>Gamila</li>"
			+ "        <li>Anuak</li>"
			+ "        <li>Nuer</li>"
			+ "        <li>Acholi</li>"
			+ "        <li>Bari</li>"
			+ "        <li>Shilluk</li>"
			+ "        <li>Luo</li>"
			+ "        <li>Maba</li>"
			+ "        <li>Maasai</li>"
			+ "        <li>Luhya</li>"
			+ "        <li>Kikuyu</li>"
			+ "        <li>Kamba</li>"
			+ "        <li>Kalenjin</li>"
			+ "        <li>Kisii</li>"
			+ "        <li>Meru</li>"
			+ "        <li>Embu</li></ol>");
	//close stream
	pw.close();
}
}
