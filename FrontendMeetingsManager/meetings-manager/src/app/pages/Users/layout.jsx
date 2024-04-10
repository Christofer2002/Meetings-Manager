
export default function RootLayout({ children }) {
    return (
        <html lang="en">
            <body>
                <div className="mainDiv_Body">
                    {children}
                </div>
            </body>
        </html>
    )
}
