package com.mj.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/countries")
public class CountryListServlet extends HttpServlet {
@Override
protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	//get writer
	PrintWriter pw=res.getWriter();
	//set response type
	res.setContentType("text/html");
	//print response
	pw.println(" <h1>List of Countries</h1>"
			+ "    <ol>"
			+ "        <li>Afghanistan</li>"
			+ "        <li>Albania</li>"
			+ "        <li>Algeria</li>"
			+ "        <li>Andorra</li>"
			+ "        <li>Angola</li>"
			+ "        <li>Antigua and Barbuda</li>"
			+ "        <li>Argentina</li>"
			+ "        <li>Armenia</li>"
			+ "        <li>Australia</li>"
			+ "        <li>Austria</li>"
			+ "        <li>Azerbaijan</li>"
			+ "        <li>Bahamas</li>"
			+ "        <li>Bahrain</li>"
			+ "        <li>Bangladesh</li>"
			+ "        <li>Barbados</li>"
			+ "        <li>Belarus</li>"
			+ "        <li>Belgium</li>"
			+ "        <li>Belize</li>"
			+ "        <li>Benin</li>"
			+ "        <li>Bhutan</li>"
			+ "        <li>Bolivia</li>"
			+ "        <li>Bosnia and Herzegovina</li>"
			+ "        <li>Botswana</li>"
			+ "        <li>Brazil</li>"
			+ "        <li>Brunei</li>"
			+ "        <li>Bulgaria</li>"
			+ "        <li>Burkina Faso</li>"
			+ "        <li>Burundi</li>"
			+ "        <li>Cabo Verde</li>"
			+ "        <li>Cambodia</li>"
			+ "        <li>Cameroon</li>"
			+ "        <li>Canada</li>"
			+ "        <li>Central African Republic</li>"
			+ "        <li>Chad</li>"
			+ "        <li>Chile</li>"
			+ "        <li>China</li>"
			+ "        <li>Colombia</li>"
			+ "        <li>Comoros</li>"
			+ "        <li>Congo, Democratic Republic of the</li>"
			+ "        <li>Congo, Republic of the</li>"
			+ "        <li>Costa Rica</li>"
			+ "        <li>Croatia</li>"
			+ "        <li>Cuba</li>"
			+ "        <li>Cyprus</li>"
			+ "        <li>Czechia</li>"
			+ "        <li>Denmark</li>"
			+ "        <li>Djibouti</li>"
			+ "        <li>Dominica</li>"
			+ "        <li>Dominican Republic</li>"
			+ "        <li>East Timor</li>"
			+ "        <li>Ecuador</li>"
			+ "        <li>Egypt</li>"
			+ "        <li>El Salvador</li>"
			+ "        <li>Equatorial Guinea</li>"
			+ "        <li>Eritrea</li>"
			+ "        <li>Estonia</li>"
			+ "        <li>Eswatini</li>"
			+ "        <li>Ethiopia</li>"
			+ "        <li>Fiji</li>"
			+ "        <li>Finland</li>"
			+ "        <li>France</li>"
			+ "        <li>Gabon</li>"
			+ "        <li>Gambia</li>"
			+ "        <li>Georgia</li>"
			+ "        <li>Germany</li>"
			+ "        <li>Ghana</li>"
			+ "        <li>Greece</li>"
			+ "        <li>Grenada</li>"
			+ "        <li>Guatemala</li>"
			+ "        <li>Guinea</li>"
			+ "        <li>Guinea-Bissau</li>"
			+ "        <li>Guyana</li>"
			+ "        <li>Haiti</li>"
			+ "        <li>Honduras</li>"
			+ "        <li>Hungary</li>"
			+ "        <li>Iceland</li>"
			+ "        <li>India</li>"
			+ "        <li>Indonesia</li>"
			+ "        <li>Iran</li>"
			+ "        <li>Iraq</li>"
			+ "        <li>Ireland</li>"
			+ "        <li>Israel</li>"
			+ "        <li>Italy</li>"
			+ "        <li>Jamaica</li>"
			+ "        <li>Japan</li>"
			+ "        <li>Jordan</li>"
			+ "        <li>Kazakhstan</li>"
			+ "        <li>Kenya</li>"
			+ "        <li>Kiribati</li>"
			+ "        <li>Korea, North</li>"
			+ "        <li>Korea, South</li>"
			+ "        <li>Kosovo</li>"
			+ "        <li>Kuwait</li>"
			+ "        <li>Kyrgyzstan</li>"
			+ "        <li>Laos</li>"
			+ "        <li>Latvia</li>"
			+ "        <li>Lebanon</li>"
			+ "        <li>Lesotho</li>"
			+ "        <li>Liberia</li>"
			+ "        <li>Libya</li>"
			+ "        <li>Liechtenstein</li>"
			+ "        <li>Lithuania</li>"
			+ "        <li>Luxembourg</li>"
			+ "        <li>Madagascar</li>"
			+ "        <li>Malawi</li>"
			+ "        <li>Malaysia</li>"
			+ "        <li>Maldives</li>"
			+ "        <li>Mali</li>"
			+ "        <li>Malta</li>"
			+ "        <li>Marshall Islands</li>"
			+ "        <li>Mauritania</li>"
			+ "        <li>Mauritius</li>"
			+ "        <li>Mexico</li>"
			+ "        <li>Micronesia</li>"
			+ "        <li>Moldova</li>"
			+ "        <li>Monaco</li>"
			+ "        <li>Mongolia</li>"
			+ "        <li>Montenegro</li>"
			+ "        <li>Morocco</li>"
			+ "        <li>Mozambique</li>"
			+ "        <li>Myanmar</li>"
			+ "        <li>Namibia</li>"
			+ "        <li>Nauru</li>"
			+ "        <li>Nepal</li>"
			+ "        <li>Netherlands</li>"
			+ "        <li>New Zealand</li>"
			+ "        <li>Nicaragua</li>"
			+ "        <li>Niger</li>"
			+ "        <li>Nigeria</li>"
			+ "        <li>North Macedonia</li>"
			+ "        <li>Norway</li>"
			+ "        <li>Oman</li>"
			+ "        <li>Pakistan</li>"
			+ "        <li>Palau</li>"
			+ "        <li>Palestine</li>"
			+ "        <li>Panama</li>"
			+ "        <li>Papua New Guinea</li>"
			+ "        <li>Paraguay</li>"
			+ "        <li>Peru</li>"
			+ "        <li>Philippines</li>"
			+ "        <li>Poland</li>"
			+ "        <li>Portugal</li>"
			+ "        <li>Qatar</li>"
			+ "        <li>Romania</li>"
			+ "        <li>Russia</li>"
			+ "        <li>Rwanda</li>"
			+ "        <li>Saint Kitts and Nevis</li>"
			+ "        <li>Saint Lucia</li>"
			+ "        <li>Saint Vincent and the Grenadines</li>"
			+ "        <li>Samoa</li>"
			+ "        <li>San Marino</li>"
			+ "        <li>Sao Tome and Principe</li>"
			+ "        <li>Saudi Arabia</li>"
			+ "        <li>Senegal</li>"
			+ "        <li>Serbia</li>"
			+ "        <li>Seychelles</li>"
			+ "        <li>Sierra Leone</li>"
			+ "        <li>Singapore</li>"
			+ "        <li>Slovakia</li>"
			+ "        <li>Slovenia</li>"
			+ "        <li>Solomon Islands</li>"
			+ "        <li>Somalia</li>"
			+ "        <li>South Africa</li>"
			+ "        <li>South Sudan</li>"
			+ "        <li>Spain</li>"
			+ "        <li>Sri Lanka</li>"
			+ "        <li>Sudan</li>"
			+ "        <li>Suriname</li>"
			+ "        <li>Sweden</li>"
			+ "        <li>Switzerland</li>"
			+ "        <li>Syria</li>"
			+ "        <li>Taiwan</li>"
			+ "        <li>Tajikistan</li>"
			+ "        <li>Tanzania</li>"
			+ "        <li>Thailand</li>"
			+ "        <li>Togo</li>"
			+ "        <li>Tonga</li>"
			+ "        <li>Trinidad and Tobago</li>"
			+ "        <li>Tunisia</li>"
			+ "        <li>Turkey</li>"
			+ "        <li>Turkmenistan</li>"
			+ "        <li>Tuvalu</li>"
			+ "        <li>Uganda</li>"
			+ "        <li>Ukraine</li>"
			+ "        <li>United Arab Emirates</li>"
			+ "        <li>United Kingdom</li>"
			+ "        <li>United States</li>"
			+ "        <li>Uruguay</li>"
			+ "        <li>Uzbekistan</li>"
			+ "        <li>Vanuatu</li>"
			+ "        <li>Vatican City</li>"
			+ "        <li>Venezuela</li>"
			+ "        <li>Vietnam</li>"
			+ "        <li>Yemen</li>"
			+ "        <li>Zambia</li>"
			+ "        <li>Zimbabwe</li>"
			+ "    </ol>");
	//close stream
	pw.close();
}
}
