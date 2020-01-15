import React from 'react';
import pollution from "./pollution"
import { connect } from 'react-redux';

class List extends React.Component{
	 constructor(props){
      super(props);
      this.state = {
			userList: pollution,
			//arr:[]
      }
	 }
	 handleCheck(e){
        // this.setState({
        // 	arr: this.state.arr.concat(info)
        // });
        console.log(e);
        this.props.saveUserDetails('userarr', e);
        //console.log(this.props.userarr);
        }

render() {
    let filtercountry = this.state.userList.filter( function (user) {
        return JSON.parse(JSON.stringify(user.state)) === "Assam"
    });

    return ( 
            <div >
                <style>{"table,td{border: 2px solid black ;background-image: url(/bd.jpg);background-repeat: no-repeat;background-size: cover;color: wheat;border-collapse: collapse;"}</style>

            <div style={{'wordBreak': "break-word",
                'boxSizing' : "border-box",
                'width': "50%",
                'padding': "10px",
                // 'overflow': "scroll",
                'float':"left"}}>
            <table>
                {/* <thead>ReactJS Task</thead> */}
                <tbody>
                <th style={{'border': "2px solid white"}} >React js Filter Table
                <tr >
                   <th style={{'border': "2px solid white", 'white-space':"nowrap"}} >Id</th>
                <th  style={{'border': "2px solid white",'white-space':"nowrap"}} >country</th>
                <th  style={{'border': "2px solid white",'white-space':"nowrap"}}>state</th>
                <th  style={{'border': "2px solid white",'white-space':"nowrap"}}>city</th>
                <th  style={{'border': "2px solid white",'white-space':"nowrap"}}>station</th>
                <th  style={{'border': "2px solid white",'white-space':"nowrap"}}>last_update</th>
                   </tr> 
            {filtercountry.map((d, idx) => {
            return (<tr key={idx} onClick={() => this.handleCheck(d)} >

            <td style={{'white-space':"nowrap"}}>{d.id}</td>
            <td style={{'white-space':"nowrap"}}>{d.country}</td>
            <td style={{'white-space':"nowrap"}}>{d.state}</td>
            <td style={{'white-space':"nowrap"}}>{d.city}</td>
            <td >{d.station}</td>
            <td >{d.last_update}</td>
            {/* <td>{d.pollutant_id}</td>
            <td>{d.pollutant_min}</td>
            <td>{d.pollutant_max}</td>
            <td>{d.pollutant_avg}</td>
            <td>{d.pollutant_unit}</td> */}
            </tr>)
            })}
            </th>
             </tbody>
            </table>
            </div>

            <div style={{'wordBreak': "break-word",
                'boxSizing' : "border-box",
                'width': "50%",
                'padding': "10px",
                // 'overflow': "scroll",
                'float':"right"}}>
                    <table>
                <tbody>
                <th style={{'border': "2px solid white"}} >React js REDUX Table
                <tr >
                   <th style={{'border': "2px solid white",'white-space':"nowrap"}} >Id</th>
                <th  style={{'border': "2px solid white",'white-space':"nowrap"}} >country</th>
                <th  style={{'border': "2px solid white",'white-space':"nowrap"}}>state</th>
                <th  style={{'border': "2px solid white"}}>city</th>
                <th  style={{'border': "2px solid white"}}>station</th>
                <th  style={{'border': "2px solid white",'white-space':"nowrap"}}>last_update</th>
                   </tr> 
            {this.props.arr.map((d, idx) => {
            return (<tr  key={idx}  >
                <td style={{'white-space':"nowrap"}}>{d.id}</td>
                <td style={{'white-space':"nowrap"}}>{d.country}</td>
                <td style={{'white-space':"nowrap"}}>{d.state}</td>
                <td style={{'white-space':"nowrap"}}>{d.city}</td>
                <td>{d.station}</td>
                <td>{d.last_update}</td>
                {/* <td>{d.pollutant_id}</td>
                <td>{d.pollutant_min}</td>
                <td>{d.pollutant_max}</td>
                <td>{d.pollutant_avg}</td>
                <td>{d.pollutant_unit}</td> */}
                </tr>)
            })}</th>
            </tbody>
            </table>
            </div>
        </div>
    )
  }     
}

const mapStateToProps = (state) => {
	return{
		arr: state.userarr,
	}
}

const mapDispatchToProps = (dispatch) => {
	return{
		saveUserDetails: (name, val) => {dispatch({type: 'ADD_INFO', [name]: val})}
	}
}

export default connect(mapStateToProps, mapDispatchToProps)(List);
