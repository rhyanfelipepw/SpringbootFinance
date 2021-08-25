import styled from 'styled-components';
import Logo from '../../img/logofinance.png'
import {Link} from 'react-router-dom';

const Nav = styled.div `
    width: 100%;
    height: 8vh;
    background: #8DB892;
    display: flex;
    justify-content: space-between;
    align-items: center;
    border-bottom: 2px solid white;

    img {
        width: 100%;
        padding: auto;
    }
`;

const Navlist = styled.ul `
    width: 28%;
    height: 100%;
    display: flex;
    justify-content: space-around;
    align-items: center;
    list-style: none;

    .link-navbar {
        color: transparent;
        width: 30%;
    }

    @media(max-width: 1440px) {
        font-size: 1em;
        margin-right: 2em;
    }

    @media(max-width: 1024px) {
        margin-right: 4.5em;
    }
`;

const Normalbuttons = styled.button `
    border: 2px solid transparent;
    outline: none;
    width: 100%;
    padding: 1%;
    font-size: 1.1em;
    background: transparent;
    cursor: pointer;
    color: #04660E;
    transition: .5s;

    @media(max-width: 1024px) {
        padding: 1em;
        font-size: 1em;
    }


    :hover {
        color: #F0F0F7;
        border-bottom: 2px solid #F0F0F7;
    }
`;

const Styledbuttons = styled.button `
    border: 2px solid #04660E;
    border-radius: 8px;
    outline: none;
    width: 100%;
    padding: .6em;
    font-size: 1.1em;
    background: transparent;
    cursor: pointer;
    color: #04660E;
    transition: .5s;

    @media(max-width: 1024px) {
        padding: .2em;
        font-size: 1em;
    }

    :hover {
        background: #04660E;
        border: 2px solid #F0F0F7;
        color: #F0F0F7;
    }
`;

 const linkStyle = {
    color: 'transparent',
    width: '8%',
    height: '100%',
    display: 'flex',
    alignItems: 'center',
    marginLeft: '1.8em'
 };

function Navbar() {
    return(
        <Nav>
            <Link className="link" to="/Home" style={linkStyle}>
                <img className="logofinanc" src={Logo} alt="Logo Financ"/>
            </Link>
            <Navlist>
                <li>
                    <Link className="link-navbar" to="/Home">
                        <Normalbuttons>Sobre</Normalbuttons>
                    </Link>
                </li>
                <li>
                    <Link className="link-navbar" to="/Home">
                        <Normalbuttons>Contato</Normalbuttons>
                    </Link>
                </li>
                <li>
                    <Link className="link-navbar" to="/login">
                        <Styledbuttons>Login</Styledbuttons>
                    </Link>
                </li>
                <li>
                    <Link className="link-navbar" to="/cadastro">
                        <Styledbuttons>Cadastro</Styledbuttons>
                    </Link>
                </li>
            </Navlist>
        </Nav>
    )
}

export default Navbar;