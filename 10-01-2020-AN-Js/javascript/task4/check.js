    function submit()
    {
        var u_name=document.getElementById("u_name").value;
        var psd=document.getElementById("psd").value;
        var confirmpsd=document.getElementById("confirmpsd").value;
        var regex_abc=/[abc]/;
        var reg_specialcharacter=/[\$@*]/;
        var regex_cap=/[A-Z]{1}/;
        if(u_name==="")
        {
            document.getElementById("namemsg").setAttribute("style","display:visible;color:red");
            document.getElementById("successmsg").setAttribute("style","background-color:black;color:white;width:30%;height:30%padding-top: 50px; border-radius:30px; display: none;");

        }
        else{
            document.getElementById("namemsg").setAttribute("style","display:none;");

        }
        
        if(psd!=confirmpsd)
        {
            document.getElementById("confirmpsd_message").textContent="Password Not Matched";
            document.getElementById("confirmpsd_message").setAttribute("style","display:visible;color:red");
            document.getElementById("successmsg").setAttribute("style","background-color:black;color:white;width:30%;height:30%padding-top: 50px; border-radius:30px; display: none;");


        }
        else{
            document.getElementById("confirmpsd_message").setAttribute("style","display:none;");
        }
        if(psd.length<8)
            {
                document.getElementById("psd_message").textContent="Password should contains atleast 8 characters";
                document.getElementById("psd_message").setAttribute("style","display:visible;color:red");
                document.getElementById("successmsg").setAttribute("style","background-color:black;color:white;width:30%;height:30%padding-top: 50px; border-radius:30px; display: none;");

        
            }
            else{
                document.getElementById("psd_message").setAttribute("style","display:none;");
                if(regex_abc.test(psd)==false)
                {
                    document.getElementById("psd_message").textContent="Password should contains either a or b or c";
                    document.getElementById("psd_message").setAttribute("style","display:visible;color:red");
                    document.getElementById("successmsg").setAttribute("style","background-color:black;color:white;width:30%;height:30%padding-top: 50px; border-radius:30px; display: none;");

                }
                else{
                    if(reg_specialcharacter.test(psd)==false)
                    {
                        document.getElementById("psd_message").textContent="Password should contains either $ or @ or *";
                        document.getElementById("psd_message").setAttribute("style","display:visible;color:red");
                        document.getElementById("successmsg").setAttribute("style","background-color:black;color:white;width:30%;height:30%padding-top: 50px; border-radius:30px; display: none;");

                    }
                    else{
                        document.getElementById("psd_message").setAttribute("style","display:none;");
                        if(regex_cap.test(psd)==false)
                        {
                            document.getElementById("psd_message").textContent="Password should contain 1 Capital letter";
                            document.getElementById("psd_message").setAttribute("style","display:visible;color:red");  
                            document.getElementById("successmsg").setAttribute("style","background-color:black;color:white;width:30%;height:30%padding-top: 50px; border-radius:30px; display: none;");
                        }
                        else{
                            if(psd!=confirmpsd)
                            {
                                document.getElementById("confirmpsd_message").textContent="Password Not Matched";
                                document.getElementById("confirmpsd_message").setAttribute("style","display:visible;color:red");
                                document.getElementById("successmsg").setAttribute("style","background-color:black;color:white;width:30%;height:30%padding-top: 50px; border-radius:30px; display: none;");
                    
                            }
                            else{
                                if(u_name==="")
                                {
                                    document.getElementById("namemsg").setAttribute("style","display:visible;color:red");
                                    document.getElementById("successmsg").setAttribute("style","background-color:black;color:white;width:30%;height:30%padding-top: 50px; border-radius:30px; display: none;");
                        
                                }
                                else{
                                    document.getElementById("namemsg").setAttribute("style","display:none;");
                                    document.getElementById("confirmpsd_message").setAttribute("style","display:none;");
                                    document.getElementById("psd_message").setAttribute("style","display:none;");
                                    document.getElementById("successmsg").innerHTML="Login Successful";
                                    document.getElementById("successmsg").setAttribute("style","background-color:black;color:white;width:30%;height:30%padding-top: 50px; border-radius:30px; display: visible;");
                                }
                              
                            }

                        }
                    }
                    
                }
            }
        
    
    }
