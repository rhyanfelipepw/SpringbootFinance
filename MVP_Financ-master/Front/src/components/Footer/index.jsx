import styled from 'styled-components';

const FooterBody = styled.div `
    background: #8DB892;
    width: 100%;
    height: 10vh;
    display: flex;
    justify-content: space-around;
    align-items: center;
    text-align: center;
    color: white;
`;

function Footer() {
    return(
        <FooterBody>
            <span>
                Copyright &copy; 2020 <strong>FinanC S/A</strong><br/> Todos os direitos reservados<br/>Av. das Cataratas, 1118 – Vila Yolanda, Foz do Iguaçu – PR, 85853-000
            </span>
            <div>
                <span>Política de Privacidade</span> |
                <span> Termos de Uso</span>
            </div>
        </FooterBody>
    )
}

export default Footer;