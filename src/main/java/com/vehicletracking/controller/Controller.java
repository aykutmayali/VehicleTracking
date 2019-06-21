/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vehicletracking.controller;

import com.vehicletracking.domain.Vehicle;
import com.vehicletracking.services.UserService;
import com.vehicletracking.services.VehicleService;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author burakzengin
 */
@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    private UserService userService;
    @Autowired
    private VehicleService vehicleService;

    @RequestMapping(value = {"/", "/login"}, method = RequestMethod.GET)
    public String login() {
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String loginPost(HttpServletRequest request) {

        String username = request.getParameter("username");
        if (userService.login(username, DigestUtils.md5Hex(request.getParameter("password")))) {
            //SUCCESS
            HttpSession session = request.getSession();
            session.setAttribute("user", username);
            session.setMaxInactiveInterval(30);
            return "redirect:vehicleRegistration";
        }
        //FAILED 
        return "redirect:/";
    }

    @RequestMapping(value = "/vehicleRegistration", method = RequestMethod.GET)
    public String home(HttpServletRequest request) {

        try {
            HttpSession session = request.getSession(false);
            if (session.getAttribute("user") != null) {
                return "vehicleRegistration";
            } else {
                return "redirect:/";
            }
        } catch (Exception exception) {
            return "redirect:/";
        }
    }

    @RequestMapping(value = "/saveVehicle", method = RequestMethod.POST)
    public String saveVehicle(HttpServletRequest request) {
        try {
            vehicleService.save(new Vehicle(request.getParameter("licenceNumber"),
                    request.getParameter("unitName"), request.getParameter("model"),
                    request.getParameter("brand"), request.getParameter("modelYear"),
                    request.getParameter("kind"), request.getParameter("type"),
                    request.getParameter("status")));

            return "redirect:vehicleRegistration";
        } catch (Exception ex) {
            return "redirect:/";
        }
    }

    @RequestMapping(value = "/vehicleList", method = RequestMethod.GET)
    public String vehicleList(HttpServletRequest request, Model m) {
        try {
            HttpSession session = request.getSession(false);
            if (session.getAttribute("user") != null) {
                m.addAttribute("vehicleList", vehicleService.findAll());
                return "vehicleList";
            }
            return "redirect:/";
        } catch (Exception exception) {
            return "redirect:/";
        }
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(HttpServletRequest request) {
        try {
            HttpSession session = request.getSession(false);
            session.invalidate();
            return "redirect:/";
        } catch (Exception ex) {
            return "redirect:/";
        }
    }
}
